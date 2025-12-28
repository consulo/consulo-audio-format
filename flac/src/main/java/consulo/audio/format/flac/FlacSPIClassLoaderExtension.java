package consulo.audio.format.flac;

import consulo.annotation.component.ExtensionImpl;
import consulo.component.extension.SPIClassLoaderExtension;
import jakarta.annotation.Nonnull;

import javax.sound.sampled.AudioSystem;
import java.util.Set;

/**
 * @author VISTALL
 * @since 2025-12-28
 */
@ExtensionImpl
public class FlacSPIClassLoaderExtension implements SPIClassLoaderExtension {
    @Nonnull
    @Override
    public Class<?> getTargetClass() {
        return AudioSystem.class;
    }

    @Nonnull
    @Override
    public Set<String> getSupportedFileExtensions() {
        return Set.of("flac");
    }
}
